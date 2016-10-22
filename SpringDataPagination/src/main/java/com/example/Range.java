package com.example;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

public class Range implements Pageable {

	private Integer startIndex;
	private Integer endIndex;
	private String sortBy;
	
	public Range(int startIndex, int endIndex, String sortBy) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.sortBy = sortBy;
    }
	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public int getOffset() {
        // TODO Auto-generated method stub
        return startIndex;
    }

	@Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public int getPageSize() {
        if (endIndex == 0)
            return 0;
        return endIndex - startIndex;
    }

	@Override
    public Sort getSort() {
        // TODO Auto-generated method stub
        if (sortBy != null && !sortBy.equalsIgnoreCase(""))
            return new Sort(Direction.ASC, sortBy);
        else
            return null;
    }

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}

}
