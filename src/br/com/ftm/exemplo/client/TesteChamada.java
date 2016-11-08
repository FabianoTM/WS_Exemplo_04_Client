package br.com.ftm.exemplo.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteChamada {

	public void listarCadastro(){
		List<Aluno> alunos = new ArrayList<>();
		
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> req_ctx = ((BindingProvider)port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<>();
		headers.put("Username", Collections.singletonList("admin"));
		headers.put("Password", Collections.singletonList("admin1"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		try {
			alunos = port.listar();

			System.out.println("################");
			System.out.println("LISTA DE ALUNOS CADASTRADOS");
			System.out.println("################");
			for(Aluno a:alunos){
				System.out.println("Nome: \t" 	+ a.getNome());
				System.out.println("Média: \t" 	+ a.getMedia());
				System.out.println("Turma: \t"	+ a.getTurma());
				System.out.println("----");
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	public void cadastrarNovo(){
		Aluno aluno = new Aluno();
		aluno.setNome("Aluno 01");
		aluno.setMedia(8.7);
		aluno.setTurma("Turma A");
		
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> req_ctx = ((BindingProvider)port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<>();
		headers.put("Username", Collections.singletonList("admin"));
		headers.put("Password", Collections.singletonList("admin"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		System.out.println(port.novo(aluno));
	}
	
	public static void main(String[] args) {
		TesteChamada tc = new TesteChamada();
		//tc.cadastrarNovo();
		tc.listarCadastro();
	}

}
