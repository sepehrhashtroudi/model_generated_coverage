var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":107,"id":34778,"methods":[{"el":103,"sc":1,"sl":98}],"name":"TestContextualWithAnnDeserializer","sl":15},{"el":22,"id":34778,"methods":[],"name":"TestContextualWithAnnDeserializer.Name","sl":20},{"el":28,"id":34778,"methods":[{"el":27,"sc":9,"sl":27}],"name":"TestContextualWithAnnDeserializer.StringValue","sl":24},{"el":35,"id":34780,"methods":[],"name":"TestContextualWithAnnDeserializer.AnnotatedContextualClassBean","sl":30},{"el":66,"id":34780,"methods":[{"el":43,"sc":9,"sl":43},{"el":46,"sc":9,"sl":44},{"el":52,"sc":9,"sl":48},{"el":65,"sc":9,"sl":54}],"name":"TestContextualWithAnnDeserializer.AnnotatedContextualDeserializer","sl":37},{"el":93,"id":34796,"methods":[{"el":74,"sc":9,"sl":74},{"el":77,"sc":9,"sl":75},{"el":83,"sc":9,"sl":79},{"el":92,"sc":9,"sl":85}],"name":"TestContextualWithAnnDeserializer.MyContextualDeserializer","sl":68}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_89":{"methods":[{"sl":27},{"sl":43},{"sl":44},{"sl":54},{"sl":75},{"sl":79},{"sl":98}],"name":"testAnnotatedContextual353","pass":true,"statements":[{"sl":27},{"sl":43},{"sl":45},{"sl":59},{"sl":60},{"sl":63},{"sl":64},{"sl":76},{"sl":82},{"sl":99},{"sl":100},{"sl":101},{"sl":102}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [89], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [89], [89], [89], [], [], [], [], [], [], [], [], [89], [], [], [], [], [89], [89], [], [], [89], [89], [], [], [], [], [], [], [], [], [], [], [89], [89], [], [], [89], [], [], [89], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [89], [89], [89], [89], [89], [], [], [], [], []]
