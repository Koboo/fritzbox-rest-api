# fritzbox-rest-api

This is a project that aims to provide fritzbox data as rest api.

Note: The REST api of fritzbox is not documented. So this library could lack some features!

# Current features:

* Get internet information
  * ipv4 (+ status)
  * ipv6 (+ status)
  * provider name
  * upstream bits (+ medium)
  * downstream bits (+ medium)
* Force reconnect (get/request new ip address)