package com.demo.steps;

/**
 * Created by youyong.li on 6/28/2018.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature/"}, //指定需要测试的feature文件所在路径
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}, //测试报告配置
        glue = {"com.demo.steps"}, //指定Step Definitions路径
        tags = {"@smoke"} //只执行标签指定的用例
)
public class RunCukesTest {
}
