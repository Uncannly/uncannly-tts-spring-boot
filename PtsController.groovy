@Controller
@RequestMapping('/')
class PtsController {
    @Value('${accessKey}') accessKey
    @Value('${secretKey}') secretKey

    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody pts(@RequestParam('word') word) {
      return "Hello pts ${word}"
    }
}
