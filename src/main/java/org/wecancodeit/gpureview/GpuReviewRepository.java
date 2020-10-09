package org.wecancodeit.gpureview;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class GpuReviewRepository {
    Map<Long, Gpu> gpuList = new HashMap<>();
    public GpuReviewRepository(){
        Gpu gpuOne = new Gpu(1L, "RTX 3080", "../images/3080.png","Nvidia","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam pharetra lorem quis dolor sollicitudin semper. In non congue nulla. Aliquam maximus lacus quis metus rhoncus laoreet. Integer ultricies ipsum nec ipsum malesuada imperdiet sed vitae odio. In nec leo fringilla, tincidunt dolor sit amet, congue felis. Etiam finibus sem sit amet feugiat porta. Morbi eros enim, feugiat vel venenatis sed, malesuada vel ante. Vivamus tempus placerat tellus a tristique. Duis eros nibh, euismod nec sem ac, tempus facilisis ante. Sed tincidunt purus massa, at lacinia massa rhoncus vel. Vivamus quis urna ac augue lacinia convallis non eu libero. Suspendisse potenti. Ut ultricies ipsum faucibus arcu pellentesque, sit amet semper lorem auctor. Donec fermentum aliquet rhoncus. Pellentesque consectetur eleifend massa eget tempor.");
        Gpu gpuTwo = new Gpu(2L, "RTX 3090", "../images/3090.png","Nvidia","Etiam sit amet tincidunt ex. Donec dapibus quis risus id malesuada. Morbi nec dapibus diam, nec aliquam ipsum. Nulla vel mi at nisl mollis facilisis. Ut ut consequat dui. Mauris dictum libero et ante mollis, a ornare tellus dapibus. Sed scelerisque in erat in tristique. Integer faucibus ex id orci posuere lobortis. Phasellus egestas nisl elementum eros tincidunt, at dignissim elit tincidunt. Pellentesque nec fringilla augue. Aenean dignissim sagittis diam nec fermentum.");
        Gpu gpuThree = new Gpu(3L, "AMD Radeon RX 5700XT", "../images/5700xt.fw.png","AMD","Etiam sit amet tincidunt ex. Donec dapibus quis risus id malesuada. Morbi nec dapibus diam, nec aliquam ipsum. Nulla vel mi at nisl mollis facilisis. Ut ut consequat dui. Mauris dictum libero et ante mollis, a ornare tellus dapibus. Sed scelerisque in erat in tristique. Integer faucibus ex id orci posuere lobortis. Phasellus egestas nisl elementum eros tincidunt, at dignissim elit tincidunt. Pellentesque nec fringilla augue. Aenean dignissim sagittis diam nec fermentum.");
       Gpu gpuFour = new Gpu(4L, "AMD Radeon RX 5600XT", "../images/5600xt.fw.png","AMD","Etiam sit amet tincidunt ex. Donec dapibus quis risus id malesuada. Morbi nec dapibus diam, nec aliquam ipsum. Nulla vel mi at nisl mollis facilisis. Ut ut consequat dui. Mauris dictum libero et ante mollis, a ornare tellus dapibus. Sed scelerisque in erat in tristique. Integer faucibus ex id orci posuere lobortis. Phasellus egestas nisl elementum eros tincidunt, at dignissim elit tincidunt. Pellentesque nec fringilla augue. Aenean dignissim sagittis diam nec fermentum.");

        gpuList.put(gpuOne.getId(),gpuOne);
        gpuList.put(gpuTwo.getId(),gpuTwo);
        gpuList.put(gpuThree.getId(),gpuThree);
       gpuList.put(gpuFour.getId(), gpuFour);



    }
    public GpuReviewRepository(Gpu ...gpusToAdd) {
        for (Gpu gpu: gpusToAdd) {
            gpuList.put(gpu.getId(), gpu);
        }
    }


    public Gpu findOne(long id) {
        return gpuList.get(id);
    }

    public Collection<Gpu> findAll() {
        return gpuList.values();
    }
}
