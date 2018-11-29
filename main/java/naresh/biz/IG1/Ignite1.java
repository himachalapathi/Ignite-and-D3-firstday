package naresh.biz.IG1;
import org.apache.ignite.*;
//import org.apache.ignite.Ignite;
//import org.apache.ignite.IgniteCache;
//import org.apache.ignite.Ignition;
// 

public class Ignite1 
{

	public static void main(String[] args) 
	{
		 try (Ignite ignite = Ignition.start("D:\\Software\\apache-ignite-fabric-2.6.0-bin\\config\\default-config.xml")) 
		    {
		      // Put values in cache.
		      IgniteCache<Object, Object> objCache1 = ignite.getOrCreateCache("myCache");
				objCache1.put(1, "Nareshreddy");
				objCache1.put(2, "Mahesh");
				objCache1.put(3, "hemadri");
				objCache1.put(4, "swathi");
				objCache1.put(5, "priya");
				objCache1.put(6, "nitya");
		 
				// Get these items from cache
				 ignite.compute().broadcast(()->System.out.println(objCache1.get(1)+"\n"+objCache1.get(2)
				 
				 +"\n"+objCache1.get(3)+"\n"+objCache1.get(4)+"\n"+objCache1.get(5)+"\n"+objCache1.get(6)));
		    }
	}

}