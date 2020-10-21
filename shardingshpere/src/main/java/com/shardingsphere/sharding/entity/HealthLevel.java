package com.shardingsphere.sharding.entity;

public class HealthLevel {

	private Long levelId;
	private String levelName;

	public HealthLevel(Long levelId, String levelName) {
		this.levelId = levelId;
		this.levelName = levelName;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
}
