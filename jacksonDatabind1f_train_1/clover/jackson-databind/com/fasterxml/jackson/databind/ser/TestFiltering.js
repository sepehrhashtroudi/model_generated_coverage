var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":113,"id":38880,"methods":[{"el":70,"sc":1,"sl":63},{"el":77,"sc":1,"sl":73},{"el":84,"sc":1,"sl":80},{"el":99,"sc":1,"sl":87}],"name":"TestFiltering","sl":13},{"el":25,"id":38880,"methods":[],"name":"TestFiltering.Bean","sl":22},{"el":55,"id":38880,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":48,"sc":9,"sl":44},{"el":53,"sc":9,"sl":50}],"name":"TestFiltering.Pod","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":87}],"name":"testMissingFilter385","pass":true,"statements":[{"sl":88},{"sl":89},{"sl":90},{"sl":93},{"sl":95},{"sl":96},{"sl":97},{"sl":98}]},"test_168":{"methods":[{"sl":63}],"name":"testSimpleInclusionFilter6","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69}]},"test_410":{"methods":[{"sl":80}],"name":"testDefaultFilter384","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83}]},"test_440":{"methods":[{"sl":73}],"name":"testSimpleExclusionFilter167","pass":true,"statements":[{"sl":74},{"sl":75},{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [168], [168], [168], [168], [168], [168], [168], [], [], [], [440], [440], [440], [440], [], [], [], [410], [410], [410], [410], [], [], [], [125], [125], [125], [125], [], [], [125], [], [125], [125], [125], [125], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
