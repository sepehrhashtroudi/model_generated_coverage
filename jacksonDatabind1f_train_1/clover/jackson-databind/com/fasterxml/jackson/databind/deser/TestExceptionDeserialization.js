var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":95,"id":40613,"methods":[{"el":65,"sc":1,"sl":57},{"el":71,"sc":1,"sl":68},{"el":81,"sc":1,"sl":74}],"name":"TestExceptionDeserialization","sl":13},{"el":40,"id":40613,"methods":[{"el":30,"sc":9,"sl":24},{"el":32,"sc":9,"sl":32},{"el":34,"sc":9,"sl":34},{"el":39,"sc":9,"sl":36}],"name":"TestExceptionDeserialization.MyException","sl":17},{"el":46,"id":40623,"methods":[{"el":45,"sc":9,"sl":45}],"name":"TestExceptionDeserialization.MyNoArgException","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_295":{"methods":[{"sl":68}],"name":"testJDK7SuppressionProperty118","pass":true,"statements":[{"sl":69},{"sl":70}]},"test_515":{"methods":[{"sl":24},{"sl":32},{"sl":34},{"sl":36},{"sl":57}],"name":"testWithCreator29","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":32},{"sl":34},{"sl":38},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_557":{"methods":[{"sl":74}],"name":"testWithNullMessage173","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [515], [], [], [515], [515], [515], [], [], [515], [], [515], [], [515], [], [515], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [515], [515], [515], [515], [515], [515], [515], [515], [], [], [], [295], [295], [295], [], [], [], [557], [557], [557], [557], [557], [557], [557], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
