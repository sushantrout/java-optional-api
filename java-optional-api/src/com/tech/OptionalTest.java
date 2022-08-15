package com.tech;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {
	public static void main(String[] args) {

		/* empty() */
		Optional<Integer> empty = Optional.empty();

		/* boolean isEmpty() */
		System.out.println(empty.isEmpty());

		/**
		 * if the param value is null then it will through NullPoinerException
		 */
		/* of(T) */
		Optional<String> of = Optional.of("Sushant");
		System.out.println(of);

		/**
		 * It is used to handel null value at run time it convert null value to empty
		 * Optional.
		 */
		/* ofNullable(T) */
		Optional<Integer> ofNullable = Optional.ofNullable(null);
		System.out.println(ofNullable);

		/**
		 * If no value present or empty OPtiinal then it will through
		 * NoSuchElementException
		 */
		/* get() */
		try {
			ofNullable.get();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/**
		 * To handel the NoSuchElementException we have pre check method is there
		 */
		if (ofNullable.isPresent()) {
			Integer pValue = ofNullable.get();
			System.out.println(pValue);
		} else {
			System.out.println("No Value present");
		}

		/* ifPresent(java.util.function.Consumer) */
		of.ifPresent(System.out::println);

		/* ifPresentOrElse(java.util.function.Consumer, java.lang.Runnable) */
		ofNullable.ifPresentOrElse(System.out::println, () -> {
		});

		List<Employee> employees = EmployeeProvider.getEmployees();

		/* filter(java.util.function.Predicate) */
		Optional<Employee> filter = employees.stream().findFirst().filter(d -> d.id < 2);
		System.out.println(filter);

		/* map(java.util.function.Function) //orElse() */

		String orElse = employees.stream().findFirst().filter(d -> d.id < -1).map(d -> d.name).orElse("NODATA");
		System.out.println(orElse);

		List<List<Integer>> forFlatmapTest = Arrays.asList(Arrays.asList(1, 2, 3, 4));

		/*
		 * flatMap(Function<? super List<Integer>, ? extends Optional<? extends
		 * List<Integer>>> mapper)
		 */
		Optional<List<Integer>> flatMap = forFlatmapTest.stream().findAny().flatMap(e -> Optional.of(e));
		System.out.println(flatMap);

		Optional<Integer> op = Optional.ofNullable(null);
		Optional<Integer> or = op.or(() -> Optional.of(100));
		System.out.println(or);

		List<Integer> collect = or.stream().collect(Collectors.toList());
		System.out.println(collect);

		/* orElseGet(java.util.function.Supplier) */
		Integer orElseGet = op.orElseGet(() -> 123);
		System.out.println(orElseGet);

		try {
			Integer orElseThrow = op.orElseThrow();
			System.out.println(orElseThrow);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			op.orElseThrow(() -> new RuntimeException());
		} catch (RuntimeException e1) {
			e1.printStackTrace();
		}

		try {
			op.orElseThrow(RuntimeException::new);
		} catch (RuntimeException e1) {
			e1.printStackTrace();
		}
	}
}
