package bg.elsys.ip.rest;

/* CPU Object with its properties */
public class CPU {
	String name;
	double clock;
	int cache;
	int cores;
	int threads;
	int tdp;

	public CPU() {
	}

	/**
	 * CPU Constructor called when a new CPU object is created
	 * @param name Central Processing Unit model
	 * @param clock CPU frequency
	 * @param cache CPU Cache in megabytes
	 * @param cores CPU cores count
	 * @param threads CPU threads count
	 * @param tdp CPU Thermal Design Power in Watts
	 */
	public CPU(String name, double clock, int cache, int cores, int threads, int tdp) {
		super();
		this.name = name;
		this.clock = clock;
		this.cache = cache;
		this.cores = cores;
		this.threads = threads;
		this.tdp = tdp;
	}
	
	/* Getters and Setters */
	
	/** 
	 * Get the name of the CPU
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Sets the name of the CPU
	 * @param tdp Integer
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Get the clock speed
	 * @return double
	 */
	public double getClock() {
		return clock;
	}
	
	/** 
	 * Sets the base clock speed
	 * @param clock double
	 */
	public void setClock(double clock) {
		this.clock = clock;
	}

	/** 
	 * Returns the name of the CPU object
	 * @return String
	 */
	public int getCache() {
		return cache;
	}

	/** 
	 * Sets the cache 
	 * @param cache Integer
	 */
	public void setCache(int cache) {
		this.cache = cache;
	}

	/** 
	 * Returns the number of cores
	 * @return int
	 */
	public int getCores() {
		return cores;
	}

	/** 
	 * Sets the amount of cores
	 * @param cores Integer
	 */
	public void setCores(int cores) {
		this.cores = cores;
	}

	/** 
	 * Returns the amount of threads
	 * @return int
	 */
	public int getThreads() {
		return threads;
	}

	/** 
	 * Sets the power consumption
	 * @param tdp Integer
	 */
	public void setThreads(int threads) {
		this.threads = threads;
	}

	/** 
	 * Returns the power consumption
	 * @return int
	 */
	public int getTdp() {
		return tdp;
	}

	/** 
	 * Sets the power consumption
	 * @param tdp Integer
	 */
	public void setTdp(int tdp) {
		this.tdp = tdp;
	}
	
}
