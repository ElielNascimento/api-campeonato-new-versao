package com.example.camp.time;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	public TimeRepository timeRepository;

	public List<TimeDTO> findAll() {
		List<TimeEntitie> list = timeRepository.findAll();
		return list.stream().map(x -> new TimeDTO(x)).collect(Collectors.toList());
	}

	public TimeDTO insert(TimeDTO dto) {
		TimeEntitie time = new TimeEntitie(dto.getId(), dto.getNome(), TimeEnum.ATIVO);
		time = timeRepository.save(time);
		return new TimeDTO(time);
	}

	public TimeDTO findById(Long idTime) {
		TimeEntitie time = timeRepository.findById(idTime).get();
		TimeDTO dto = new TimeDTO(time);
		return dto;
	}

	public void deleteById(Long idTime) {
		timeRepository.deleteById(idTime);
	}

	public TimeDTO update(Long id, TimeDTO obj) {
		TimeEntitie time = timeRepository.findById(id).get();
		time.setNome(obj.getNome());
		
		timeRepository.save(time);
		return new TimeDTO(time);

	}

}
