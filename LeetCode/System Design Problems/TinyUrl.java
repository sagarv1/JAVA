public class Codec {

    HashMap<String, String> map = new HashMap<>();
    
    // to short url
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        sb.append((char)(48 + Math.random()*79));
        
        while(map.containsKey(sb.toString())) 
            sb.append((char)(48 + Math.random()*79));
            
        map.put(sb.toString(), longUrl);
        return sb.toString();
    }

    // to original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));