package br.com.settech.delicious.criteria;

import java.util.Collection;

import br.com.settech.delicious.attribute.Attribute;
import br.com.settech.delicious.attribute.Meta;
import br.com.settech.delicious.attribute.Results;
import br.com.settech.delicious.attribute.Start;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.attribute.Time;
import br.com.settech.delicious.list.AttributeList;

public class AllCriteria{

	private Tag tag;
	private Start start;
	private Results results;
	private Time fromDt;
	private Time toDt;
	private Meta meta;

	public AllCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllCriteria withTag(Tag tag) {
		this.tag = tag;
		return this;
	}

	public AllCriteria withStart(Start start) {
		this.start = start;
		return this;
	}

	public AllCriteria withResults(Results results) {
		this.results = results;
		return this;
	}

	public AllCriteria withFromDt(Time fromDt) {
		this.fromDt = fromDt;
		return this;
	}

	public AllCriteria withToDt(Time toDt) {
		this.toDt = toDt;
		return this;
	}

	public AllCriteria withMeta(Meta meta) {
		this.meta = meta;
		return this;
	}

	public Collection<Attribute> attributes() {
		Attribute attFromDt = new Attribute() {

			public String name() {
				// TODO Auto-generated method stub
				return "fromdt";
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return fromDt==null?"":fromDt.toString();
			}

		};
		Attribute attToDt = new Attribute() {
			public String name() {
				// TODO Auto-generated method stub
				return "todt";
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return toDt==null?"":toDt.toString();
			}

		};

		return new AttributeList(tag, meta, attFromDt, attToDt, start, results);
	}

}
