package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hp.dto.UserDTO;
import com.hp.entity.Provider;
import com.hp.service.ProviderService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apiProvider")
@RestController
public class ProviderCotroller {

	@Autowired
	ProviderService providerService;
	
//	@Autowired
//	private Provider provider;
	
	@RequestMapping("/provider/List")
	public List<Provider> getAllUser(){
		return (List<Provider>) providerService.getAllProvider();
	}
	
	@PostMapping("/provider")
	public void addProvider(@RequestBody Provider provider) {
		providerService.createProvider(provider);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> authenticateUser(@RequestBody UserDTO userDTO) {
		return ResponseEntity.ok().body(this.providerService.authenticateUser(userDTO.getUserName(), userDTO.getPassword()));
	}
	
	@RequestMapping(value = "/provider/{userName}",method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Provider> getProviderUser(@PathVariable String userName){
		return providerService.getSingleProvider(userName);
	}
	
	@GetMapping("/singleProvider/{id}")
	public Provider getSingleProviderById(@PathVariable Long id){
		return providerService.getSingleProviderById(id);
	} 
		 
	@PutMapping("/provider/{id}")
	public ResponseEntity<Provider> updateProvider(@PathVariable long id,@RequestBody Provider provider){
		provider.setId(id);
		return ResponseEntity.ok().body(this.providerService.updateProvider(provider));
	}
	
	@DeleteMapping("provider/{id}")
	public void deleteUser(@PathVariable Long id) {
		providerService.deleteProvider(id);
	}
	
	@RequestMapping("provider/name/{name}")
	public Provider findByUserName(@PathVariable String name) {
		return providerService.findByProviderName(name);
	}

	@GetMapping("{name}")
	public long getFindId(@PathVariable String name) {
		return providerService.getFindId(name);
	}
	
	
//	@PostMapping("/saveUserProfile")
//	public BodyBuilder uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
//
//		System.out.println("Original Image Byte Size - " + file.getBytes().length);
//		ProfileImage img = new ProfileImage(file.getOriginalFilename(), file.getContentType(),
//				compressBytes(file.getBytes()));
//		imageRepository.save(img);
//		return ResponseEntity.status(HttpStatus.OK);
//	}
//	
//	// compress the image bytes before storing it in the database
//	public static byte[] compressBytes(byte[] data) {
//		        Deflater deflater = new Deflater();
//		        deflater.setInput(data);
//		        deflater.finish();
//		        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//		        byte[] buffer = new byte[1024];
//		        while (!deflater.finished()) {
//		            int count = deflater.deflate(buffer);
//		            outputStream.write(buffer, 0, count);
//		        }
//		        try {
//		            outputStream.close();
//		        } catch (IOException e) {
//		        }
//		        System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
//		        return outputStream.toByteArray();
//		    }
//		
//		@GetMapping(path = { "/get/{imageName}" })
//		public ProfileImage getImage(@PathVariable("imageName") String imageName) throws IOException {
//
//			final Optional<ProfileImage> retrievedImage = imageRepository.findByName(imageName);
//			ProfileImage img = new ProfileImage(retrievedImage.get().getName(), retrievedImage.get().getType(),
//					decompressBytes(retrievedImage.get().getPicByte()));
//			return img;
//		}
//		
//		// uncompress the image bytes before returning it to the angular application
//		public static byte[] decompressBytes(byte[] data) {
//			        Inflater inflater = new Inflater();
//			        inflater.setInput(data);
//			        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//			        byte[] buffer = new byte[1024];
//			        try {
//			            while (!inflater.finished()) {
//			                int count = inflater.inflate(buffer);
//			                outputStream.write(buffer, 0, count);
//			            }
//			            outputStream.close();
//			        } catch (IOException ioe) {
//			        } catch (DataFormatException e) {
//			        }
//			        return outputStream.toByteArray();
//			    }
	
}
