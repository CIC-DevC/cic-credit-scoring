package com.cic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cic.domain.Arpu;
import com.cic.dto.ArpuDTO;

@Mapper
public interface ArpuMapper {
	ArpuMapper INSTANCE = Mappers.getMapper(ArpuMapper.class);

	ArpuDTO toDto(Arpu arpu);
}
