package chapter02.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    /**
     * 默认情况下，bean的ID与带有@Bean注解的方法名是一样的
     *
     * @return
     */
    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}
