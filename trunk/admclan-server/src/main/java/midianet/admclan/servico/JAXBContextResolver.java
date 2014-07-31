package midianet.admclan.servico;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.json.JSONJAXBContext;

@Provider
public class JAXBContextResolver implements ContextResolver<JAXBContext> {
	
    private JAXBContext context;
    private Class[] types = {midianet.admclan.entidade.Membro.class};
    
    public JAXBContextResolver() throws JAXBException {
        this.context = new JSONJAXBContext(JSONConfiguration.natural().build(),types);
    }
    
    public JAXBContext getContext(Class<?> objectType) {
        return (types[0].equals(objectType)) ? context : null;
    }
    
}