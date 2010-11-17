package org.scale7.zookeeper.cages;

public interface ISinglePathLock extends ILock, Comparable<ISinglePathLock> {
	/**
	 * Get the path that a lock is operating against
	 * @return							The path the lock is attempting to lock
	 */
	String getLockPath();


}
