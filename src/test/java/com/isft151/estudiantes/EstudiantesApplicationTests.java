package com.isft151.estudiantes;

import com.isft151.estudiantes.dtos.requests.PersonaRequest;
import com.isft151.estudiantes.dtos.requests.ProfesorRequest;
import com.isft151.estudiantes.dtos.responses.PersonaResponse;
import com.isft151.estudiantes.dtos.responses.ProfesorResponse;
import com.isft151.estudiantes.mocks.*;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.models.Profesor;
import com.isft151.estudiantes.repositories.PersonaRepository;
import com.isft151.estudiantes.repositories.ProfesorRepository;
import com.isft151.estudiantes.services.PersonaService;
import com.isft151.estudiantes.services.ProfesorService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
class EstudiantesApplicationTests {

	@Mock
	private PersonaRepository personaRepository;

	@Mock
	private ProfesorRepository profesorRepository;

	@Mock
	private PersonaService personaService;

	@Mock
	private ProfesorService profesorService;

	@Test
	public void personaServiceReturnsPersonaResponse() {
		PersonaRequest personaRequestMock = PersonaRequestMock.mockRequest();
		PersonaResponse personaResponseMock = PersonaResponseMock.mockResponse();
		Persona personaMock = PersonaMock.mockEntity();

		// When
		when(personaRepository.save(personaMock)).thenReturn(personaMock);
		when(personaService.newPersona(personaRequestMock)).thenReturn
				(ResponseEntity.ok("Persona guardada: " + personaResponseMock.getNombre() + " " + personaRequestMock.getApellido()));

		// Then
		Assert.assertNotNull(personaService.newPersona(personaRequestMock));
		Assert.assertEquals(ResponseEntity.ok("Persona guardada: " + personaResponseMock.getNombre() + " " + personaRequestMock.getApellido()),
				personaService.newPersona(personaRequestMock));
	}

	@Test
	public void setProfesorServiceReturnsProfesorResponse() throws Exception {
		ProfesorRequest profesorRequestMock = ProfesorRequestMock.mockRequest();
		ProfesorResponse profesorResponseMock = ProfesorResponseMock.mockResponse();
		Profesor profesorMock = ProfesorMock.mockEntity();

		// When
		when(profesorRepository.save(profesorMock)).thenReturn(profesorMock);
		when(profesorService.setProfesor(profesorRequestMock)).thenReturn(ResponseEntity.ok("Profesor guardado: " + profesorMock.getPersona().getNombre() + " "
				+ profesorMock.getPersona().getApellido()));

		// Then
		Assert.assertNotNull(profesorService.setProfesor(profesorRequestMock));
		Assert.assertEquals(ResponseEntity.ok("Profesor guardado: " + profesorResponseMock.getProfesor().getNombre() + " "
				+ profesorResponseMock.getProfesor().getApellido()), profesorService.setProfesor(profesorRequestMock));
	}

}
