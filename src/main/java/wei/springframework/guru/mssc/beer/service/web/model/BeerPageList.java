package wei.springframework.guru.mssc.beer.service.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * BeerPageList.
 * TODO
 * <p>
 * 2020/6/15
 *
 * @author wei
 * @version 1.0.0
 **/
public class BeerPageList extends PageImpl<BeerDto> {

    public BeerPageList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPageList(List<BeerDto> content) {
        super(content);
    }
}
