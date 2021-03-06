package com.aol.cyclops.lambda.functions;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aol.cyclops.util.function.CurryConsumer;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class CurryConsumerTest {

	Integer value;
	@Test
	public void testCurry2() {
		CurryConsumer.curryC2( (Integer a, Integer b) -> value = a+b).apply(2).accept(3);
		assertThat(value,equalTo(5));
	}

	@Test
	public void testCurry3() {
		CurryConsumer.curryC3( (Integer a, Integer b, Integer c) -> value = a+b+c).apply(2).apply(2).accept(3);
		assertThat(value,equalTo(7));
	}

	@Test
	public void testCurry4() {
		CurryConsumer.curryC4( (Integer a, Integer b, Integer c,Integer d) -> value = a+b+c+d).apply(2).apply(1).apply(2).accept(3);
		assertThat(value,equalTo(8));
	}

	@Test
	public void testCurry5() {
		CurryConsumer.curryC5( (Integer a, Integer b, Integer c,Integer d, Integer e) -> value = a+b+c+d+e).apply(2).apply(1).apply(10).apply(2).accept(3);
		assertThat(value,equalTo(18));
	}

}
