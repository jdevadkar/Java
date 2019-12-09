package com.hr.documents;

/**
 * The Class WorkContract.
 */
public class WorkContract implements ExportableText, ExportablePdf, ExportbleJson {

	/** The content. */
	private String content;

	/**
	 * Instantiates a new work contract.
	 *
	 * @param content the content
	 */
	public WorkContract(String content) {
		this.content = content;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hr.documents.ExportablePdf#toPdf()
	 */
	@Override
	public byte[] toPdf() {
		return content.getBytes();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hr.documents.ExportbleJson#toJson()
	 */
	@Override
	public String toJson() {
		return "{'content':'" + this.content + "'}";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hr.documents.ExportableText#toText()
	 */
	@Override
	public String toText() {
		return this.content;
	}

}
