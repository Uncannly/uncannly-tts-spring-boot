@Controller
@RequestMapping("/")
class PtsController {

  @RequestMapping(method=RequestMethod.GET)
  @ResponseBody pts(@RequestParam("word") word) {
      return "Hello pts ${word}"
  }
}
