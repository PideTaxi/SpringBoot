package com.mycompany.servicio;

import com.mycompany.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *
 * @author Luis Antonio
 */
@SpringBootTest
public class PersonaServiceTest {
    @MockBean
    private PersonaService personaService;
    @Test
    public void listarPersonas() {
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
            assertEquals(2, personas.size());
    }

}
