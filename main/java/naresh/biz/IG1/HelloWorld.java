package naresh.biz.IG1;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
public class HelloWorld 
{
  public static void main(String[] args) throws IgniteException 
  {
    try (Ignite ignite = Ignition.start("D:\\Software\\apache-ignite-fabric-2.6.0-bin\\config\\default-config.xml")) 
    {
      // Put values in cache.
      IgniteCache<Object, Object> cache = ignite.getOrCreateCache("myCache");
      cache.put(1, "Hello");
      cache.put(2, "World!");
      // Get values from cache
      // Broadcast 'Hello World' on all the nodes in the cluster.
      ignite.compute().broadcast(()->System.out.println(cache.get(1) + " " + cache.get(2)));
    }
  }
}