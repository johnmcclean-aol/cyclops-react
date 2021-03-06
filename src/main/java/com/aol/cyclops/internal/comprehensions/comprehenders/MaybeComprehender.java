package com.aol.cyclops.internal.comprehensions.comprehenders;

import java.util.function.Function;
import java.util.function.Predicate;

import com.aol.cyclops.control.Maybe;
import com.aol.cyclops.types.extensability.Comprehender;
import com.aol.cyclops.types.extensability.ValueComprehender;

public class MaybeComprehender implements ValueComprehender<Maybe> {
	public Class getTargetClass(){
		return Maybe.class;
	}
	@Override
	public Object filter(Maybe o,Predicate p) {
		return o.filter(p);
	}

	@Override
	public Object map(Maybe o,Function fn) {
		return o.map(fn);
	}
	
	@Override
	public Maybe flatMap(Maybe o,Function fn) {
		return o.flatMap(fn);
	}

	@Override
	public boolean instanceOfT(Object apply) {
		return apply instanceof Maybe;
	}

	@Override
	public Maybe of(Object o) {
		return Maybe.of(o);
	}

	@Override
	public Maybe empty() {
		return Maybe.none();
	}
	public Object resolveForCrossTypeFlatMap(Comprehender comp,Maybe apply){
		if(apply.isPresent())
			return comp.of(apply.get());
		else
			return comp.empty();
	}

}
