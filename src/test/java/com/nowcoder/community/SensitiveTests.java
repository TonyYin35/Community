package com.nowcoder.community;


import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "这里要赌博，嫖娼，还有吸毒，可以开票，哈哈哈!";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        String text1 = "这里要☆赌博☆，☆嫖娼☆，还有☆吸毒☆，可以☆开票☆，哈哈哈!";
        text1 = sensitiveFilter.filter(text);
        System.out.println(text1);
    }
}
