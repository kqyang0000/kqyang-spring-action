package chapter02.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private CDPlayer media;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
        cd.play();
    }

    @Test
    public void mediaPlayerTest() {
        assertNotNull(media);
        media.play();
    }
}
