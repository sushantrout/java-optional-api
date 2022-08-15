# java-optional-api
<ol>
<li> public static <T> java.util.Optional<T> empty()<br><br></li>
<li>  public static <T> java.util.Optional<T> of(T)<br><br></li>
 <li> public static <T> java.util.Optional<T> ofNullable(T)<br><br></li>
 <li> public T get()<br><br></li>
 <li> public boolean isPresent()<br><br></li>
 <li> public boolean isEmpty()<br><br></li>
 <li> public void ifPresent(java.util.function.Consumer<? super T>)<br><br></li>
 <li> public void ifPresentOrElse(java.util.function.Consumer<? super T>, java.lang.Runnable)<br><br></li>
 <li> public java.util.Optional<T> filter(java.util.function.Predicate<? super T>)<br><br></li>
 <li> public <U> java.util.Optional<U> map(java.util.function.Function<? super T, ? extends U>)<br><br></li>
 <li> public <U> java.util.Optional<U> flatMap(java.util.function.Function<? super T, ? extends java.util.Optional<? extends U>>)<br><br></li>
 <li> public java.util.Optional<T> or(java.util.function.Supplier<? extends java.util.Optional<? extends T>>)<br><br></li>
 <li> public java.util.stream.Stream<T> stream()<br><br></li>
 <li> public T orElse(T)<br><br></li>
 <li> public T orElseGet(java.util.function.Supplier<? extends T>)<br><br></li>
 <li> public T orElseThrow()<br><br></li>
 <li> public <X extends java.lang.Throwable> T orElseThrow(java.util.function.Supplier<? extends X>) throws X<br><br></li>
</ol>
