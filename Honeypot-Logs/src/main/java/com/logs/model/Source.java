package com.logs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "source", type = "source", shards = 1)
public class Source {

	//@Id
	//public Long id;
	//@Field(type = FieldType.Date, format = DateFormat.date_optional_time)
	
	@Id
	public Long id;
	
	public String dateTime;
	public int srcPort;
	public String service;
	public int dstPort;
	public String appLayerProtocol;
	
	public int severityScore;
	public String category;
	public Origin origin;
	public Destination destination;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @return the srcPort
	 */
	public int getSrcPort() {
		return srcPort;
	}
	/**
	 * @param srcPort the srcPort to set
	 */
	public void setSrcPort(int srcPort) {
		this.srcPort = srcPort;
	}
	/**
	 * @return the service
	 */
	public String getService() {
		return service;
	}
	/**
	 * @param service the service to set
	 */
	public void setService(String service) {
		this.service = service;
	}
	/**
	 * @return the dstPort
	 */
	public int getDstPort() {
		return dstPort;
	}
	/**
	 * @param dstPort the dstPort to set
	 */
	public void setDstPort(int dstPort) {
		this.dstPort = dstPort;
	}
	/**
	 * @return the appLayerProtocol
	 */
	public String getAppLayerProtocol() {
		return appLayerProtocol;
	}
	/**
	 * @param appLayerProtocol the appLayerProtocol to set
	 */
	public void setAppLayerProtocol(String appLayerProtocol) {
		this.appLayerProtocol = appLayerProtocol;
	}
	/**
	 * @return the severityScore
	 */
	public int getSeverityScore() {
		return severityScore;
	}
	/**
	 * @param severityScore the severityScore to set
	 */
	public void setSeverityScore(int severityScore) {
		this.severityScore = severityScore;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the origin
	 */
	public Origin getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public Destination getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Source [id=" + id + ", dateTime=" + dateTime + ", srcPort=" + srcPort + ", service=" + service
				+ ", dstPort=" + dstPort + ", appLayerProtocol=" + appLayerProtocol + ", severityScore=" + severityScore
				+ ", category=" + category + ", origin=" + origin + ", destination=" + destination + "]";
	}
	
}
