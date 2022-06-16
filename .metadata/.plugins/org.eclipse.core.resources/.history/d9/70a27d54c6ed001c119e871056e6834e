package com.example.camp.time;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/times")
public class TimeController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private TimeService timeService;

	@GetMapping
	private ResponseEntity<List<TimeDTO>> findAll() {
		List<TimeDTO> list = timeService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	private ResponseEntity<TimeDTO> insert(@RequestBody TimeDTO dto) {
		dto = timeService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<TimeDTO> deleteById(@PathVariable Long id){
		 timeService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping("/{id}")
	private ResponseEntity<TimeDTO>update(@PathVariable Long id,@RequestBody TimeDTO obj){
	   TimeDTO time = timeService.update(id, obj);
		return ResponseEntity.ok().body(time);
		
	}

}
