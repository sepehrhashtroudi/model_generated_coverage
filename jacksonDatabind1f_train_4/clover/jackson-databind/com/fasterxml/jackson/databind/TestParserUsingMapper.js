var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":115,"id":37865,"methods":[{"el":81,"sc":1,"sl":77},{"el":100,"sc":1,"sl":84}],"name":"TestParserUsingMapper","sl":12},{"el":25,"id":37865,"methods":[{"el":24,"sc":9,"sl":24}],"name":"TestParserUsingMapper.Pojo","sl":20},{"el":68,"id":37867,"methods":[{"el":47,"sc":9,"sl":42},{"el":52,"sc":9,"sl":49},{"el":67,"sc":9,"sl":54}],"name":"TestParserUsingMapper.MyEscapes","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_317":{"methods":[{"sl":77}],"name":"testEscapingUsingMapper293","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80}]},"test_417":{"methods":[{"sl":84}],"name":"testReadingArrayAsTree297","pass":true,"statements":[{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [317], [317], [317], [317], [], [], [], [417], [417], [417], [417], [417], [417], [417], [], [417], [417], [417], [417], [417], [417], [417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
