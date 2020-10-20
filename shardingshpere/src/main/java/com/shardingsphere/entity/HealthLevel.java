package com.shardingsphere.entity;

import lombok.Data;

@Data
public class HealthLevel {

	private Long levelId;
	private String levelName;

	public HealthLevel(Long levelId, String levelName) {
		this.levelId = levelId;
		this.levelName = levelName;
	}
}
