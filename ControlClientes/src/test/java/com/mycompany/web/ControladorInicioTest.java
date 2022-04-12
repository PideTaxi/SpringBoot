
package com.mycompany.web;

import com.mycompany.domain.Persona;
import com.mycompany.servicio.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author Luis Antonio
 */
@WebMvcTest(ControladorInicio.class)
public class ControladorInicioTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private PersonaService personaService;
    
    @Test
    public void inicio(){
        List personas = new ArrayList();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.setNombre("Luis Antonio");
        p1.setApellido("Avendaño");
        p1.setEmail("lavendano@mail.com");
        p1.setTelefono("7773494940");
        p2.setNombre("Isaac");
        p2.setApellido("Isaac");
        p2.setEmail("ii@mail.com");
        p2.setTelefono("00000033");
        personas.add(p1);
        personas.add(p2);
        when(personaService.listarPersonas()).thenReturn(personas);
        
    }
    
}
