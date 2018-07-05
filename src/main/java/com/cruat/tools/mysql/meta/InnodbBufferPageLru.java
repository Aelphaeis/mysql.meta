package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_BUFFER_PAGE_LRU")
public class InnodbBufferPageLru {
	@Column(name = "IS_OLD")
	String isOld;

	@Column(name = "PAGE_NUMBER")
	BigInteger pageNumber;

	@Column(name = "FREE_PAGE_CLOCK")
	BigInteger freePageClock;

	@Column(name = "FLUSH_TYPE")
	BigInteger flushType;

	@Column(name = "IS_HASHED")
	String isHashed;

	@Column(name = "INDEX_NAME")
	String indexName;

	@Column(name = "OLDEST_MODIFICATION")
	BigInteger oldestModification;

	@Column(name = "DATA_SIZE")
	BigInteger dataSize;

	@Column(name = "FIX_COUNT")
	BigInteger fixCount;

	@Column(name = "SPACE")
	BigInteger space;

	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "NEWEST_MODIFICATION")
	BigInteger newestModification;

	@Column(name = "COMPRESSED_SIZE")
	BigInteger compressedSize;

	@Column(name = "PAGE_TYPE")
	String pageType;

	@Column(name = "IO_FIX")
	String ioFix;

	@Column(name = "POOL_ID")
	BigInteger poolId;

	@Column(name = "NUMBER_RECORDS")
	BigInteger numberRecords;

	@Column(name = "LRU_POSITION")
	BigInteger lruPosition;

	@Column(name = "COMPRESSED")
	String compressed;

	@Column(name = "ACCESS_TIME")
	BigInteger accessTime;

	public String getIsOld() {
		return isOld;
	}

	public void setIsOld(String isOld) {
		this.isOld = isOld;
	}

	public BigInteger getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(BigInteger pageNumber) {
		this.pageNumber = pageNumber;
	}

	public BigInteger getFreePageClock() {
		return freePageClock;
	}

	public void setFreePageClock(BigInteger freePageClock) {
		this.freePageClock = freePageClock;
	}

	public BigInteger getFlushType() {
		return flushType;
	}

	public void setFlushType(BigInteger flushType) {
		this.flushType = flushType;
	}

	public String getIsHashed() {
		return isHashed;
	}

	public void setIsHashed(String isHashed) {
		this.isHashed = isHashed;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public BigInteger getOldestModification() {
		return oldestModification;
	}

	public void setOldestModification(BigInteger oldestModification) {
		this.oldestModification = oldestModification;
	}

	public BigInteger getDataSize() {
		return dataSize;
	}

	public void setDataSize(BigInteger dataSize) {
		this.dataSize = dataSize;
	}

	public BigInteger getFixCount() {
		return fixCount;
	}

	public void setFixCount(BigInteger fixCount) {
		this.fixCount = fixCount;
	}

	public BigInteger getSpace() {
		return space;
	}

	public void setSpace(BigInteger space) {
		this.space = space;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigInteger getNewestModification() {
		return newestModification;
	}

	public void setNewestModification(BigInteger newestModification) {
		this.newestModification = newestModification;
	}

	public BigInteger getCompressedSize() {
		return compressedSize;
	}

	public void setCompressedSize(BigInteger compressedSize) {
		this.compressedSize = compressedSize;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getIoFix() {
		return ioFix;
	}

	public void setIoFix(String ioFix) {
		this.ioFix = ioFix;
	}

	public BigInteger getPoolId() {
		return poolId;
	}

	public void setPoolId(BigInteger poolId) {
		this.poolId = poolId;
	}

	public BigInteger getNumberRecords() {
		return numberRecords;
	}

	public void setNumberRecords(BigInteger numberRecords) {
		this.numberRecords = numberRecords;
	}

	public BigInteger getLruPosition() {
		return lruPosition;
	}

	public void setLruPosition(BigInteger lruPosition) {
		this.lruPosition = lruPosition;
	}

	public String getCompressed() {
		return compressed;
	}

	public void setCompressed(String compressed) {
		this.compressed = compressed;
	}

	public BigInteger getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(BigInteger accessTime) {
		this.accessTime = accessTime;
	}

}