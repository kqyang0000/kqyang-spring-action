package chapter03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Primary注解作用为：当一个接口有多个实现类时，bean自动注入时就会抛出歧义性异常，
 * 加入此注解后，会优先注入该bean到spring容器中，但此注解只能标识在一个接口的实现类
 * 中，否则还会出现上述问题。
 */
@Component
@Primary
@Cold
public class Magic {

    /**
     * @Qualifier为限定自动装配的bean，作用与@Primary注解的作用一样，可与@Autowired
     * 和@Inject注解配合使用；
     * @Qualifier注解也可与@Component注解连用，作用为自定义限定符，在注入时只需要添加
     * 对应的自定义限定符名称即可，例如：@Qualifier("cold")
     */
    @Autowired
    @Qualifier("magic")
    private Magic magic;

    /**
     * 条件话的bean，since spring 4.0 @profile注解中就包含此注解，详情请看源码
     *
     * @return
     */
    @Bean
    @Conditional(MagicExistCondition.class)
    @Cold
    public Magic magic() {
        return new Magic();
    }
}
