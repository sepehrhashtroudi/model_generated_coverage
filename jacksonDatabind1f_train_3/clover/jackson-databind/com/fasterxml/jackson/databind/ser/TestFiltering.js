var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":106,"id":35709,"methods":[{"el":70,"sc":1,"sl":63},{"el":77,"sc":1,"sl":73},{"el":92,"sc":1,"sl":80}],"name":"TestFiltering","sl":13},{"el":25,"id":35709,"methods":[],"name":"TestFiltering.Bean","sl":22},{"el":55,"id":35709,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":48,"sc":9,"sl":44},{"el":53,"sc":9,"sl":50}],"name":"TestFiltering.Pod","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_511":{"methods":[{"sl":63}],"name":"testSimpleInclusionFilter6","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69}]},"test_547":{"methods":[{"sl":80}],"name":"testMissingFilter396","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":86},{"sl":88},{"sl":89},{"sl":90},{"sl":91}]},"test_84":{"methods":[{"sl":73}],"name":"testSimpleExclusionFilter178","pass":true,"statements":[{"sl":74},{"sl":75},{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [511], [511], [511], [511], [511], [511], [511], [], [], [], [84], [84], [84], [84], [], [], [], [547], [547], [547], [547], [], [], [547], [], [547], [547], [547], [547], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
