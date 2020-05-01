package com.copipe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloCopipe2 {
	Map<String, List<String>> skillMap = skillMap();
	Map<String, List<Integer>> levelMap = levelMap();
	
	@RequestMapping("/{skillNo}")
	public String copipe(@PathVariable String skillNo) {
		if ((skillNo.equals("1")) || (skillNo.equals("2"))) {
			return new CopyPaste<String, List<String>>(skillNo, skillMap.get(skillNo)).toString();			
		}  else if ((skillNo.equals("3")) || (skillNo.equals("4"))) {
			return new CopyPaste<String, List<Integer>>(skillNo, levelMap.get(skillNo)).toString();			
		}
		return "あり得ないスキルです！";			
	}
	// スキル
	Map<String, List<String>> skillMap() {
		HashMap<String, List<String>> map = new HashMap<>();
		List<String> list1 = new ArrayList<>(Arrays.asList("1", "高速コピペ"));
		map.put("1", list1);
		List<String> list2 = new ArrayList<>(Arrays.asList("2", "ブラインドコピペ"));
		map.put("2", list2);
		return map;
	}
	// レベル
	Map<String, List<Integer>> levelMap() {
		HashMap<String, List<Integer>> map = new HashMap<>();
		List<Integer> list3 = new ArrayList<>(Arrays.asList(30, 3330));
		map.put("3", list3);
		List<Integer> list4 = new ArrayList<>(Arrays.asList(40, 4444));
		map.put("4", list4);
		return map;
	}
}