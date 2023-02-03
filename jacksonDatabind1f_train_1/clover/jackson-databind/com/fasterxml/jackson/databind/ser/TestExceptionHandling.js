var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":118,"id":39000,"methods":[{"el":63,"sc":1,"sl":52},{"el":75,"sc":1,"sl":66},{"el":104,"sc":5,"sl":95},{"el":117,"sc":5,"sl":106}],"name":"TestExceptionHandling","sl":18},{"el":29,"id":39000,"methods":[],"name":"TestExceptionHandling.Bean","sl":27},{"el":39,"id":39000,"methods":[{"el":38,"sc":9,"sl":34}],"name":"TestExceptionHandling.SerializerWithErrors","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_314":{"methods":[{"sl":52},{"sl":95},{"sl":106}],"name":"testExceptionWithMapperAndGenerator486","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":61},{"sl":98},{"sl":101},{"sl":102},{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":114},{"sl":116}]},"test_480":{"methods":[{"sl":66},{"sl":95},{"sl":106}],"name":"testExceptionWithSimpleMapper518","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":73},{"sl":98},{"sl":101},{"sl":102},{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":114},{"sl":116}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [314], [314], [314], [314], [314], [314], [314], [], [], [314], [], [], [], [], [480], [480], [480], [480], [480], [], [], [480], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [314, 480], [], [], [314, 480], [], [], [314, 480], [314, 480], [], [], [], [314, 480], [], [314, 480], [314, 480], [314, 480], [], [314, 480], [314, 480], [314, 480], [], [314, 480], [], [], []]
