package com.fli.pageexe;

import com.base.one.Base;
import com.flip.loc.Fliloc;

public class Flipageexe extends Fliloc{
	public static void close() {
		Base.click(Base.find_xpath(Fliloc.close));
	}
	public static void electronics() {
		Base.click(Base.find_xpath(Fliloc.electronics));
	}
	public static void laptop() {
		Base.selectbyvalue(Base.find_xpath(Fliloc.laptop), "Gaming Laptops");
	}

}
