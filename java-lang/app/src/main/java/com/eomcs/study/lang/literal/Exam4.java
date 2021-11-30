// 리터럴: 부동 소수점 리터럴과 값의 범위
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam4")
public class Exam4 {


  @GetMapping("/test1")
  public String test1() {
    float value = 987.654321f;
    return "부동소수점: " + value;
  }

  @GetMapping("/test2")
  public String test2() {
    float value = 987.654321;
    return "부동소수점: " + value;
  }


}