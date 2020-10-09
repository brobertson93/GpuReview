package org.wecancodeit.gpureview;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GpuReviewRepositoryTest {
    private GpuReviewRepository underTest;
    Gpu gpuOne = new Gpu(1L, "GTX 3080", "/images/3080.jpg","GPU","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam pharetra lorem quis dolor sollicitudin semper. In non congue nulla. Aliquam maximus lacus quis metus rhoncus laoreet. Integer ultricies ipsum nec ipsum malesuada imperdiet sed vitae odio. In nec leo fringilla, tincidunt dolor sit amet, congue felis. Etiam finibus sem sit amet feugiat porta. Morbi eros enim, feugiat vel venenatis sed, malesuada vel ante. Vivamus tempus placerat tellus a tristique. Duis eros nibh, euismod nec sem ac, tempus facilisis ante. Sed tincidunt purus massa, at lacinia massa rhoncus vel. Vivamus quis urna ac augue lacinia convallis non eu libero. Suspendisse potenti. Ut ultricies ipsum faucibus arcu pellentesque, sit amet semper lorem auctor. Donec fermentum aliquet rhoncus. Pellentesque consectetur eleifend massa eget tempor.");
    Gpu gpuTwo = new Gpu(2L, "RTX 3090", "/images/3090.png","GPU","Etiam sit amet tincidunt ex. Donec dapibus quis risus id malesuada. Morbi nec dapibus diam, nec aliquam ipsum. Nulla vel mi at nisl mollis facilisis. Ut ut consequat dui. Mauris dictum libero et ante mollis, a ornare tellus dapibus. Sed scelerisque in erat in tristique. Integer faucibus ex id orci posuere lobortis. Phasellus egestas nisl elementum eros tincidunt, at dignissim elit tincidunt. Pellentesque nec fringilla augue. Aenean dignissim sagittis diam nec fermentum.");

@Test
    public void shouldFindGpuOne(){
    underTest = new GpuReviewRepository(gpuOne);
    Gpu foundGpu = underTest.findOne(1L);

    assertEquals(gpuOne, foundGpu);

}

@Test
    public void shouldFindAllGpus(){
    underTest = new GpuReviewRepository(gpuOne,gpuTwo);
    Collection<Gpu> foundGpus = underTest.findAll();
    assertThat(foundGpus).contains(gpuOne,gpuTwo);
}
}
