package zio.web.http.model

case class StatusCode(code: Int, message: String)

object StatusCode {
  val Continue           = StatusCode(100, "Continue")
  val SwitchingProtocols = StatusCode(101, "Switching Protocols")
  val Processing         = StatusCode(102, "Processing")

  val Ok                          = StatusCode(200, "OK")
  val Created                     = StatusCode(201, "Created")
  val Accepted                    = StatusCode(202, "Accepted")
  val NonAuthoritativeInformation = StatusCode(203, "Non-authoritative Information")
  val NoContent                   = StatusCode(204, "No Content")
  val ResetContent                = StatusCode(205, "Reset Content")
  val PartialContent              = StatusCode(206, "Partial Content")
  val MultiStatus                 = StatusCode(207, "Multi-Status")
  val AlreadyReported             = StatusCode(208, "Already Reported")
  val ImUsed                      = StatusCode(226, "IM Used")

  val MultipleChoices   = StatusCode(300, "Multiple Choices")
  val MovedPermanently  = StatusCode(301, "Moved Permanently")
  val Found             = StatusCode(302, "Found")
  val SeeOther          = StatusCode(303, "See Other")
  val NotModified       = StatusCode(304, "Not Modified")
  val UseProxy          = StatusCode(305, "Use Proxy")
  val TemporaryRedirect = StatusCode(307, "Temporary Redirect")
  val PermanentRedirect = StatusCode(308, "Permanent Redirect")

  val BadRequest                      = StatusCode(400, "Bad Request")
  val Unauthorized                    = StatusCode(401, "Unauthorized")
  val PaymentRequired                 = StatusCode(402, "Payment Required")
  val Forbidden                       = StatusCode(403, "Forbidden")
  val NotFound                        = StatusCode(404, "Not Found")
  val MethodNotAllowed                = StatusCode(405, "Method Not Allowed")
  val NotAcceptable                   = StatusCode(406, "Not Acceptable")
  val ProxyAuthenticationRequired     = StatusCode(407, "Proxy Authentication Required")
  val RequestTimeout                  = StatusCode(408, "Request Timeout")
  val Conflict                        = StatusCode(409, "Conflict")
  val Gone                            = StatusCode(410, "Gone")
  val LengthRequired                  = StatusCode(411, "Length Required")
  val PreconditionFailed              = StatusCode(412, "Precondition Failed")
  val PayloadTooLarge                 = StatusCode(413, "Payload Too Large")
  val RequestUriTooLong               = StatusCode(414, "Request-URI Too Long")
  val UnsupportedMediaType            = StatusCode(415, "Unsupported Media Type")
  val RequestedRangeNotSatisfiable    = StatusCode(416, "Requested Range Not Satisfiable")
  val ExpectationFailed               = StatusCode(417, "Expectation Failed")
  val ImATeapot                       = StatusCode(418, "I'm a teapot")
  val MisdirectedRequest              = StatusCode(421, "Misdirected Request")
  val UnprocessableEntity             = StatusCode(422, "Unprocessable Entity")
  val Locked                          = StatusCode(423, "Locked")
  val FailedDependency                = StatusCode(424, "Failed Dependency")
  val UpgradeRequired                 = StatusCode(426, "Upgrade Required")
  val PreconditionRequired            = StatusCode(428, "Precondition Required")
  val TooManyRequests                 = StatusCode(429, "Too Many Requests")
  val RequestHeaderFieldsTooLarge     = StatusCode(431, "Request Header Fields Too Large")
  val ConnectionClosedWithoutResponse = StatusCode(444, "Connection Closed Without Response")
  val UnavailableForLegalReasons      = StatusCode(451, "Unavailable For Legal Reasons")
  val ClientClosedRequest             = StatusCode(499, "Client Closed Request")

  val InternalServerError           = StatusCode(500, "Internal Server Error")
  val NotImplemented                = StatusCode(501, "Not Implemented")
  val BadGateway                    = StatusCode(502, "Bad Gateway")
  val ServiceUnavailable            = StatusCode(503, "Service Unavailable")
  val GatewayTimeout                = StatusCode(504, "Gateway Timeout")
  val HttpVersionNotSupported       = StatusCode(505, "HTTP Version Not Supported")
  val VariantAlsoNegotiates         = StatusCode(506, "Variant Also Negotiates")
  val InsufficientStorage           = StatusCode(507, "Insufficient Storage")
  val LoopDetected                  = StatusCode(508, "Loop Detected")
  val NotExtended                   = StatusCode(510, "Not Extended")
  val NetworkAuthenticationRequired = StatusCode(511, "Network Authentication Required")
  val NetworkConnectTimeoutError    = StatusCode(599, "Network Connect Timeout Error")
}
