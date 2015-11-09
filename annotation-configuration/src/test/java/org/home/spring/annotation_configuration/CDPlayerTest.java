package org.home.spring.annotation_configuration;

import org.home.spring.annotation_configuration.disk.CompactDisk;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisk cd;

    @Test
    public void shouldBeNotNullInjectedInstance() {
        assertThat(cd).isNotNull();
    }

    @Test
    public void shouldSpecialMessageBeGenerated() throws Exception {
        cd.play();

        assertThat(systemOutRule.getLog()).isEqualTo("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
    }
}