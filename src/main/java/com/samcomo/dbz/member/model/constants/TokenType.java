package com.samcomo.dbz.member.model.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TokenType {

  ACCESS_TOKEN("Access-Token", 6000L * 10 * 1000000),  // 10분 -> 임시로 늘림
  REFRESH_TOKEN("Refresh-Token", 6000L * 10 * 60 * 2400000);  // 24시간 -> 임시로 늘림

  private final String key;
  private final Long expiredMs;
}
