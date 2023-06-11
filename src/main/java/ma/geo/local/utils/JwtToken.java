package ma.geo.local.utils;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtToken {
     String generateToken(UserDetails userDetails);
     Boolean validateToken(String token, UserDetails userDetails);
     String getUsernameFromToken(String token);
}
