@Controller
@RequestMapping("/")
class PtsController {

  @RequestMapping(method=RequestMethod.GET)
  @ResponseBody String pts() {
    return "Hello pts"
  }
}
