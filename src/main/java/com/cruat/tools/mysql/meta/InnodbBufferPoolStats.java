package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_BUFFER_POOL_STATS")
public class InnodbBufferPoolStats {
	@Column(name = "PAGES_NOT_MADE_YOUNG")
	BigInteger pagesNotMadeYoung;

	@Column(name = "OLD_DATABASE_PAGES")
	BigInteger oldDatabasePages;

	@Column(name = "NUMBER_PAGES_CREATED")
	BigInteger numberPagesCreated;

	@Column(name = "READ_AHEAD_EVICTED_RATE")
	double readAheadEvictedRate;

	@Column(name = "LRU_IO_TOTAL")
	BigInteger lruIoTotal;

	@Column(name = "NUMBER_PAGES_READ_AHEAD")
	BigInteger numberPagesReadAhead;

	@Column(name = "UNCOMPRESS_CURRENT")
	BigInteger uncompressCurrent;

	@Column(name = "PAGES_MADE_YOUNG_RATE")
	double pagesMadeYoungRate;

	@Column(name = "MODIFIED_DATABASE_PAGES")
	BigInteger modifiedDatabasePages;

	@Column(name = "DATABASE_PAGES")
	BigInteger databasePages;

	@Column(name = "UNCOMPRESS_TOTAL")
	BigInteger uncompressTotal;

	@Column(name = "FREE_BUFFERS")
	BigInteger freeBuffers;

	@Column(name = "PAGES_CREATE_RATE")
	double pagesCreateRate;

	@Column(name = "LRU_IO_CURRENT")
	BigInteger lruIoCurrent;

	@Column(name = "PAGES_MADE_NOT_YOUNG_RATE")
	double pagesMadeNotYoungRate;

	@Column(name = "PAGES_WRITTEN_RATE")
	double pagesWrittenRate;

	@Column(name = "POOL_SIZE")
	BigInteger poolSize;

	@Column(name = "NUMBER_PAGES_GET")
	BigInteger numberPagesGet;

	@Column(name = "HIT_RATE")
	BigInteger hitRate;

	@Column(name = "YOUNG_MAKE_PER_THOUSAND_GETS")
	BigInteger youngMakePerThousandGets;

	@Column(name = "READ_AHEAD_RATE")
	double readAheadRate;

	@Column(name = "NUMBER_READ_AHEAD_EVICTED")
	BigInteger numberReadAheadEvicted;

	@Column(name = "PENDING_DECOMPRESS")
	BigInteger pendingDecompress;

	@Column(name = "NUMBER_PAGES_WRITTEN")
	BigInteger numberPagesWritten;

	@Column(name = "PENDING_FLUSH_LRU")
	BigInteger pendingFlushLru;

	@Column(name = "PAGES_MADE_YOUNG")
	BigInteger pagesMadeYoung;

	@Column(name = "POOL_ID")
	BigInteger poolId;

	@Column(name = "NUMBER_PAGES_READ")
	BigInteger numberPagesRead;

	@Column(name = "PAGES_READ_RATE")
	double pagesReadRate;

	@Column(name = "NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
	BigInteger notYoungMakePerThousandGets;

	@Column(name = "PENDING_READS")
	BigInteger pendingReads;

	@Column(name = "PENDING_FLUSH_LIST")
	BigInteger pendingFlushList;

	public BigInteger getPagesNotMadeYoung() {
		return pagesNotMadeYoung;
	}

	public void setPagesNotMadeYoung(BigInteger pagesNotMadeYoung) {
		this.pagesNotMadeYoung = pagesNotMadeYoung;
	}

	public BigInteger getOldDatabasePages() {
		return oldDatabasePages;
	}

	public void setOldDatabasePages(BigInteger oldDatabasePages) {
		this.oldDatabasePages = oldDatabasePages;
	}

	public BigInteger getNumberPagesCreated() {
		return numberPagesCreated;
	}

	public void setNumberPagesCreated(BigInteger numberPagesCreated) {
		this.numberPagesCreated = numberPagesCreated;
	}

	public double getReadAheadEvictedRate() {
		return readAheadEvictedRate;
	}

	public void setReadAheadEvictedRate(double readAheadEvictedRate) {
		this.readAheadEvictedRate = readAheadEvictedRate;
	}

	public BigInteger getLruIoTotal() {
		return lruIoTotal;
	}

	public void setLruIoTotal(BigInteger lruIoTotal) {
		this.lruIoTotal = lruIoTotal;
	}

	public BigInteger getNumberPagesReadAhead() {
		return numberPagesReadAhead;
	}

	public void setNumberPagesReadAhead(BigInteger numberPagesReadAhead) {
		this.numberPagesReadAhead = numberPagesReadAhead;
	}

	public BigInteger getUncompressCurrent() {
		return uncompressCurrent;
	}

	public void setUncompressCurrent(BigInteger uncompressCurrent) {
		this.uncompressCurrent = uncompressCurrent;
	}

	public double getPagesMadeYoungRate() {
		return pagesMadeYoungRate;
	}

	public void setPagesMadeYoungRate(double pagesMadeYoungRate) {
		this.pagesMadeYoungRate = pagesMadeYoungRate;
	}

	public BigInteger getModifiedDatabasePages() {
		return modifiedDatabasePages;
	}

	public void setModifiedDatabasePages(BigInteger modifiedDatabasePages) {
		this.modifiedDatabasePages = modifiedDatabasePages;
	}

	public BigInteger getDatabasePages() {
		return databasePages;
	}

	public void setDatabasePages(BigInteger databasePages) {
		this.databasePages = databasePages;
	}

	public BigInteger getUncompressTotal() {
		return uncompressTotal;
	}

	public void setUncompressTotal(BigInteger uncompressTotal) {
		this.uncompressTotal = uncompressTotal;
	}

	public BigInteger getFreeBuffers() {
		return freeBuffers;
	}

	public void setFreeBuffers(BigInteger freeBuffers) {
		this.freeBuffers = freeBuffers;
	}

	public double getPagesCreateRate() {
		return pagesCreateRate;
	}

	public void setPagesCreateRate(double pagesCreateRate) {
		this.pagesCreateRate = pagesCreateRate;
	}

	public BigInteger getLruIoCurrent() {
		return lruIoCurrent;
	}

	public void setLruIoCurrent(BigInteger lruIoCurrent) {
		this.lruIoCurrent = lruIoCurrent;
	}

	public double getPagesMadeNotYoungRate() {
		return pagesMadeNotYoungRate;
	}

	public void setPagesMadeNotYoungRate(double pagesMadeNotYoungRate) {
		this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
	}

	public double getPagesWrittenRate() {
		return pagesWrittenRate;
	}

	public void setPagesWrittenRate(double pagesWrittenRate) {
		this.pagesWrittenRate = pagesWrittenRate;
	}

	public BigInteger getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(BigInteger poolSize) {
		this.poolSize = poolSize;
	}

	public BigInteger getNumberPagesGet() {
		return numberPagesGet;
	}

	public void setNumberPagesGet(BigInteger numberPagesGet) {
		this.numberPagesGet = numberPagesGet;
	}

	public BigInteger getHitRate() {
		return hitRate;
	}

	public void setHitRate(BigInteger hitRate) {
		this.hitRate = hitRate;
	}

	public BigInteger getYoungMakePerThousandGets() {
		return youngMakePerThousandGets;
	}

	public void setYoungMakePerThousandGets(BigInteger youngMakePerThousandGets) {
		this.youngMakePerThousandGets = youngMakePerThousandGets;
	}

	public double getReadAheadRate() {
		return readAheadRate;
	}

	public void setReadAheadRate(double readAheadRate) {
		this.readAheadRate = readAheadRate;
	}

	public BigInteger getNumberReadAheadEvicted() {
		return numberReadAheadEvicted;
	}

	public void setNumberReadAheadEvicted(BigInteger numberReadAheadEvicted) {
		this.numberReadAheadEvicted = numberReadAheadEvicted;
	}

	public BigInteger getPendingDecompress() {
		return pendingDecompress;
	}

	public void setPendingDecompress(BigInteger pendingDecompress) {
		this.pendingDecompress = pendingDecompress;
	}

	public BigInteger getNumberPagesWritten() {
		return numberPagesWritten;
	}

	public void setNumberPagesWritten(BigInteger numberPagesWritten) {
		this.numberPagesWritten = numberPagesWritten;
	}

	public BigInteger getPendingFlushLru() {
		return pendingFlushLru;
	}

	public void setPendingFlushLru(BigInteger pendingFlushLru) {
		this.pendingFlushLru = pendingFlushLru;
	}

	public BigInteger getPagesMadeYoung() {
		return pagesMadeYoung;
	}

	public void setPagesMadeYoung(BigInteger pagesMadeYoung) {
		this.pagesMadeYoung = pagesMadeYoung;
	}

	public BigInteger getPoolId() {
		return poolId;
	}

	public void setPoolId(BigInteger poolId) {
		this.poolId = poolId;
	}

	public BigInteger getNumberPagesRead() {
		return numberPagesRead;
	}

	public void setNumberPagesRead(BigInteger numberPagesRead) {
		this.numberPagesRead = numberPagesRead;
	}

	public double getPagesReadRate() {
		return pagesReadRate;
	}

	public void setPagesReadRate(double pagesReadRate) {
		this.pagesReadRate = pagesReadRate;
	}

	public BigInteger getNotYoungMakePerThousandGets() {
		return notYoungMakePerThousandGets;
	}

	public void setNotYoungMakePerThousandGets(BigInteger notYoungMakePerThousandGets) {
		this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
	}

	public BigInteger getPendingReads() {
		return pendingReads;
	}

	public void setPendingReads(BigInteger pendingReads) {
		this.pendingReads = pendingReads;
	}

	public BigInteger getPendingFlushList() {
		return pendingFlushList;
	}

	public void setPendingFlushList(BigInteger pendingFlushList) {
		this.pendingFlushList = pendingFlushList;
	}

}