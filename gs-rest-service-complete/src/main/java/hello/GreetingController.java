package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping ("/nacionalidades")
    public List<Nacionalidades> nacionalidades(){
    	return getListNacionalidades();
    }
    
    private List<Nacionalidades> getListNacionalidades(){
    	List<Nacionalidades> lista = new ArrayList<>();
    	for(int i = 0; i<3; i++) {
    		lista.add(new Nacionalidades(i,"nacionalidad " + i));
    	}
    	
    	return lista;
    	
    }
}
