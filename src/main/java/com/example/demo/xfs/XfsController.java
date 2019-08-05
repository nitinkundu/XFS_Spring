package com.example.demo.xfs;


import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import com.example.demo.xfs.XfsRepository;
import com.example.demo.xfs.Xfs;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;




@RestController
@CrossOrigin(origins="http://ec2-13-233-251-211.ap-south-1.compute.amazonaws.com:4200")
@RequestMapping("/api")
public class XfsController {  
	
	private final XfsRepository xfsRepository; 
	
	public XfsController(XfsRepository xfsRepository ) {
		this.xfsRepository=xfsRepository;
	}
	
	@GetMapping("/xfs")
	public Xfs getXFS() {
	  List<Xfs> xfs = xfsRepository.findAll();
	  return xfs.get(xfs.size() - 1);
	}

	@PostMapping("/postKSR2")
	public Xfs addXFSData(@RequestBody Xfs xfs) {
		xfs.set_id(ObjectId.get());
		xfsRepository.save(xfs);
		return xfs;
	}
	
}
