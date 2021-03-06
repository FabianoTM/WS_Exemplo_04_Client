
package br.com.ftm.exemplo.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ftm.exemplo.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Novo_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "novo");
    private final static QName _ListarResponse_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "listarResponse");
    private final static QName _NovoResponse_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "novoResponse");
    private final static QName _Exception_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "Exception");
    private final static QName _Autenticado_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "autenticado");
    private final static QName _AutenticadoResponse_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "autenticadoResponse");
    private final static QName _Listar_QNAME = new QName("http://ws.exemplo.ftm.com.br/", "listar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ftm.exemplo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Autenticado }
     * 
     */
    public Autenticado createAutenticado() {
        return new Autenticado();
    }

    /**
     * Create an instance of {@link AutenticadoResponse }
     * 
     */
    public AutenticadoResponse createAutenticadoResponse() {
        return new AutenticadoResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link Novo }
     * 
     */
    public Novo createNovo() {
        return new Novo();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link NovoResponse }
     * 
     */
    public NovoResponse createNovoResponse() {
        return new NovoResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Novo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "novo")
    public JAXBElement<Novo> createNovo(Novo value) {
        return new JAXBElement<Novo>(_Novo_QNAME, Novo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NovoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "novoResponse")
    public JAXBElement<NovoResponse> createNovoResponse(NovoResponse value) {
        return new JAXBElement<NovoResponse>(_NovoResponse_QNAME, NovoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autenticado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "autenticado")
    public JAXBElement<Autenticado> createAutenticado(Autenticado value) {
        return new JAXBElement<Autenticado>(_Autenticado_QNAME, Autenticado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "autenticadoResponse")
    public JAXBElement<AutenticadoResponse> createAutenticadoResponse(AutenticadoResponse value) {
        return new JAXBElement<AutenticadoResponse>(_AutenticadoResponse_QNAME, AutenticadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplo.ftm.com.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

}
