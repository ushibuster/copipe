package com.copipe;

import java.util.List;

public class CopyPaste<K, V> {
	private K k;
	private List<?> v;
	public CopyPaste(K k, List<?> v) {
		this.k = k;
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public List<?> getV() {
		return v;
	}
	public void setV(List<?> v) {
		this.v = v;
	}
	@Override
	public String toString() {
		if (v.get(0) instanceof Integer) {
			return "あたなのコピペレベルは " + v.get(0) + " コピペパワーは " + v.get(1) + " です！" ;
		} 
		return "スキル番号 " + v.get(0) + " のスキル名は <b>" + v.get(1) + "</b> です！";
	}
}